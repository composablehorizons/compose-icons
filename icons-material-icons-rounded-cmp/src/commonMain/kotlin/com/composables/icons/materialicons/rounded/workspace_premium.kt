package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Workspace_premium: ImageVector
    get() {
        if (_Workspace_premium != null) return _Workspace_premium!!
        
        _Workspace_premium = ImageVector.Builder(
            name = "workspace_premium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.92f, 12.75f)
                lineTo(12f, 11.93f)
                lineToRelative(1.07f, 0.81f)
                curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f)
                lineToRelative(-0.42f, -1.36f)
                lineToRelative(1.2f, -0.95f)
                curveTo(15f, 9.6f, 14.79f, 9f, 14.31f, 9f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-0.43f, -1.34f)
                curveToRelative(-0.15f, -0.46f, -0.8f, -0.46f, -0.95f, 0f)
                lineTo(11.09f, 9f)
                horizontalLineTo(9.68f)
                curveTo(9.21f, 9f, 9f, 9.6f, 9.37f, 9.89f)
                lineToRelative(1.19f, 0.95f)
                lineToRelative(-0.42f, 1.36f)
                curveTo(10f, 12.67f, 10.53f, 13.04f, 10.92f, 12.75f)
                close()
                moveTo(6f, 21.61f)
                curveToRelative(0f, 0.68f, 0.67f, 1.16f, 1.32f, 0.95f)
                lineTo(12f, 21f)
                lineToRelative(4.68f, 1.56f)
                curveTo(17.33f, 22.78f, 18f, 22.3f, 18f, 21.61f)
                verticalLineToRelative(-6.33f)
                curveToRelative(1.24f, -1.41f, 2f, -3.25f, 2f, -5.28f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 2.03f, 0.76f, 3.87f, 2f, 5.28f)
                verticalLineTo(21.61f)
                close()
                moveTo(12f, 4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 4f, 12f, 4f)
                close()
            }
        }.build()
        
        return _Workspace_premium!!
    }

private var _Workspace_premium: ImageVector? = null

