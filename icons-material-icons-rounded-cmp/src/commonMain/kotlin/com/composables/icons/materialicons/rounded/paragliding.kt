package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Paragliding: ImageVector
    get() {
        if (_Paragliding != null) return _Paragliding!!
        
        _Paragliding = ImageVector.Builder(
            name = "paragliding",
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
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveTo(13.1f, 17f, 12f, 17f)
                close()
                moveTo(17.95f, 14f)
                curveToRelative(-0.52f, 0f, -0.94f, 0.4f, -0.99f, 0.92f)
                curveToRelative(-0.2f, 2.03f, -1.05f, 2.68f, -1.48f, 3.02f)
                curveTo(14.68f, 18.54f, 14f, 19f, 12f, 19f)
                reflectiveCurveToRelative(-2.68f, -0.46f, -3.48f, -1.06f)
                curveToRelative(-0.43f, -0.34f, -1.28f, -0.99f, -1.48f, -3.02f)
                curveTo(6.99f, 14.4f, 6.57f, 14f, 6.05f, 14f)
                curveToRelative(-0.59f, 0f, -1.06f, 0.51f, -1f, 1.09f)
                curveToRelative(0.22f, 2.08f, 1.07f, 3.47f, 2.24f, 4.41f)
                curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f)
                lineTo(9f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f)
                curveToRelative(1.17f, -0.94f, 2.03f, -2.32f, 2.24f, -4.41f)
                curveTo(19.01f, 14.51f, 18.53f, 14f, 17.95f, 14f)
                close()
                moveTo(12f, 0f)
                curveTo(5.92f, 0f, 1f, 1.9f, 1f, 4.25f)
                verticalLineToRelative(3.49f)
                curveTo(1f, 8.55f, 1.88f, 9f, 2.56f, 8.57f)
                curveTo(2.7f, 8.48f, 2.84f, 8.39f, 3f, 8.31f)
                lineTo(5f, 13f)
                horizontalLineToRelative(2f)
                lineToRelative(1.5f, -6.28f)
                curveTo(9.6f, 6.58f, 10.78f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(2.4f, 0.08f, 3.5f, 0.22f)
                lineTo(17f, 13f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, -4.69f)
                curveToRelative(0.16f, 0.09f, 0.3f, 0.17f, 0.44f, 0.26f)
                curveTo(22.12f, 9f, 23f, 8.55f, 23f, 7.74f)
                verticalLineTo(4.25f)
                curveTo(23f, 1.9f, 18.08f, 0f, 12f, 0f)
                close()
                moveTo(5.88f, 11.24f)
                lineTo(4.37f, 7.69f)
                curveToRelative(0.75f, -0.28f, 1.6f, -0.52f, 2.53f, -0.71f)
                lineTo(5.88f, 11.24f)
                close()
                moveTo(18.12f, 11.24f)
                lineTo(17.1f, 6.98f)
                curveToRelative(0.93f, 0.19f, 1.78f, 0.43f, 2.53f, 0.71f)
                lineTo(18.12f, 11.24f)
                close()
            }
        }.build()
        
        return _Paragliding!!
    }

private var _Paragliding: ImageVector? = null

