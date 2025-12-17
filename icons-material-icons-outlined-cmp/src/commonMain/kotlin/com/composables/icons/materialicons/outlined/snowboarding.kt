package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Snowboarding: ImageVector
    get() {
        if (_Snowboarding != null) return _Snowboarding!!
        
        _Snowboarding = ImageVector.Builder(
            name = "snowboarding",
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
                moveTo(14f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(14f, 4.1f, 14f, 3f)
                close()
                moveTo(21.4f, 20.09f)
                curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f)
                curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f)
                lineTo(17f, 20.69f)
                lineToRelative(-1f, -6.19f)
                lineToRelative(-3.32f, -2.67f)
                lineToRelative(1.8f, -2.89f)
                curveTo(15.63f, 10.78f, 17.68f, 12f, 20f, 12f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.85f, 0f, -3.44f, -1.12f, -4.13f, -2.72f)
                lineToRelative(-0.52f, -1.21f)
                curveTo(15.16f, 5.64f, 14.61f, 5f, 13.7f, 5f)
                horizontalLineTo(8f)
                lineTo(5.5f, 9f)
                lineToRelative(1.7f, 1.06f)
                lineTo(9.1f, 7f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-2.51f, 3.99f)
                curveToRelative(-0.28f, 0.45f, -0.37f, 1f, -0.25f, 1.52f)
                lineTo(9.5f, 16f)
                lineTo(6f, 18.35f)
                lineToRelative(-0.47f, -0.1f)
                curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f)
                curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f)
                curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f)
                curveTo(1.98f, 16.88f, 2f, 17.05f, 2.07f, 17.2f)
                curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f)
                lineToRelative(12.63f, 2.69f)
                curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f)
                curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f)
                curveTo(22.06f, 20.6f, 21.83f, 20.18f, 21.4f, 20.09f)
                close()
                moveTo(8.73f, 18.93f)
                lineToRelative(3.02f, -2.03f)
                lineToRelative(-0.44f, -3.32f)
                lineToRelative(2.84f, 2.02f)
                lineToRelative(0.75f, 4.64f)
                lineTo(8.73f, 18.93f)
                close()
            }
        }.build()
        
        return _Snowboarding!!
    }

private var _Snowboarding: ImageVector? = null

