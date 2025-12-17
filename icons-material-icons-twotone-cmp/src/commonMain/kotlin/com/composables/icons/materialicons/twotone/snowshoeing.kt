package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Snowshoeing: ImageVector
    get() {
        if (_Snowshoeing != null) return _Snowshoeing!!
        
        _Snowshoeing = ImageVector.Builder(
            name = "snowshoeing",
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
                moveTo(12.5f, 3.5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(12.5f, 4.6f, 12.5f, 3.5f)
                close()
                moveTo(6.32f, 19.03f)
                lineToRelative(-1.14f, -1.47f)
                lineTo(4f, 18.5f)
                lineToRelative(2.38f, 3.04f)
                curveToRelative(0.51f, 0.65f, 1.16f, 1.15f, 1.88f, 1.41f)
                curveToRelative(0.28f, 0.1f, 0.53f, 0.04f, 0.72f, -0.11f)
                curveToRelative(0.3f, -0.23f, 0.42f, -0.7f, 0.12f, -1.07f)
                curveToRelative(-0.08f, -0.1f, -0.2f, -0.17f, -0.31f, -0.22f)
                curveToRelative(-0.43f, -0.18f, -0.82f, -0.45f, -1.14f, -0.83f)
                lineToRelative(-0.08f, -0.1f)
                lineTo(11f, 18.2f)
                lineToRelative(0.89f, -3.22f)
                lineToRelative(2.11f, 2f)
                verticalLineToRelative(4.52f)
                horizontalLineToRelative(-2f)
                verticalLineTo(23f)
                horizontalLineToRelative(3.87f)
                curveToRelative(0.82f, 0f, 1.61f, -0.21f, 2.26f, -0.61f)
                curveToRelative(0.26f, -0.16f, 0.37f, -0.39f, 0.37f, -0.64f)
                curveToRelative(0f, -0.38f, -0.3f, -0.75f, -0.77f, -0.75f)
                curveToRelative(-0.13f, 0f, -0.26f, 0.04f, -0.37f, 0.1f)
                curveToRelative(-0.4f, 0.23f, -0.87f, 0.37f, -1.36f, 0.4f)
                lineToRelative(0f, -6.02f)
                lineToRelative(-2.11f, -2f)
                lineToRelative(0.6f, -3f)
                curveTo(15.79f, 11.98f, 17.8f, 13f, 20f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.9f, 0f, -3.51f, -1.02f, -4.31f, -2.42f)
                lineToRelative(-1f, -1.58f)
                curveToRelative(-0.4f, -0.6f, -1f, -1f, -1.7f, -1f)
                curveTo(12.24f, 6f, 11.58f, 6.34f, 7f, 8.28f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.58f)
                lineToRelative(1.79f, -0.7f)
                lineTo(9.2f, 17f)
                lineTo(6.32f, 19.03f)
                close()
            }
        }.build()
        
        return _Snowshoeing!!
    }

private var _Snowshoeing: ImageVector? = null

