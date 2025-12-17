package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Workspace_premium: ImageVector
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
                moveTo(12f, 4f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 4f, 12f, 4f)
                close()
                moveTo(14.31f, 13.69f)
                lineTo(12f, 11.93f)
                lineToRelative(-2.32f, 1.76f)
                lineToRelative(0.88f, -2.85f)
                lineTo(8.25f, 9f)
                horizontalLineToRelative(2.84f)
                lineTo(12f, 6.19f)
                lineTo(12.91f, 9f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-2.32f, 1.84f)
                lineTo(14.31f, 13.69f)
                close()
                moveTo(12f, 19f)
                lineToRelative(-4f, 1.02f)
                verticalLineToRelative(-3.1f)
                curveTo(9.18f, 17.6f, 10.54f, 18f, 12f, 18f)
                reflectiveCurveToRelative(2.82f, -0.4f, 4f, -1.08f)
                verticalLineToRelative(3.1f)
                lineTo(12f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.68f, 13.69f)
                lineTo(12f, 11.93f)
                lineToRelative(2.31f, 1.76f)
                lineToRelative(-0.88f, -2.85f)
                lineTo(15.75f, 9f)
                horizontalLineToRelative(-2.84f)
                lineTo(12f, 6.19f)
                lineTo(11.09f, 9f)
                horizontalLineTo(8.25f)
                lineToRelative(2.31f, 1.84f)
                lineTo(9.68f, 13.69f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 2.03f, 0.76f, 3.87f, 2f, 5.28f)
                verticalLineTo(23f)
                lineToRelative(6f, -2f)
                lineToRelative(6f, 2f)
                verticalLineToRelative(-7.72f)
                curveTo(19.24f, 13.87f, 20f, 12.03f, 20f, 10f)
                close()
                moveTo(12f, 4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 4f, 12f, 4f)
                close()
                moveTo(12f, 19f)
                lineToRelative(-4f, 1.02f)
                verticalLineToRelative(-3.1f)
                curveTo(9.18f, 17.6f, 10.54f, 18f, 12f, 18f)
                reflectiveCurveToRelative(2.82f, -0.4f, 4f, -1.08f)
                verticalLineToRelative(3.1f)
                lineTo(12f, 19f)
                close()
            }
        }.build()
        
        return _Workspace_premium!!
    }

private var _Workspace_premium: ImageVector? = null

