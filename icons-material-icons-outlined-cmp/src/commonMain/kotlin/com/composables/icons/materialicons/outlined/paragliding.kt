package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Paragliding: ImageVector
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
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveTo(14f, 16.1f, 13.1f, 17f, 12f, 17f)
                close()
                moveTo(15.48f, 17.94f)
                curveTo(14.68f, 18.54f, 14f, 19f, 12f, 19f)
                reflectiveCurveToRelative(-2.68f, -0.46f, -3.48f, -1.06f)
                curveTo(8.04f, 17.55f, 7f, 16.76f, 7f, 14f)
                horizontalLineTo(5f)
                curveToRelative(0f, 2.7f, 0.93f, 4.41f, 2.3f, 5.5f)
                curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f)
                verticalLineTo(24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f)
                curveToRelative(1.37f, -1.09f, 2.3f, -2.8f, 2.3f, -5.5f)
                horizontalLineToRelative(-2f)
                curveTo(17f, 16.76f, 15.96f, 17.55f, 15.48f, 17.94f)
                close()
                moveTo(23f, 4.25f)
                verticalLineToRelative(3.49f)
                curveToRelative(0f, 0.8f, -0.88f, 1.26f, -1.56f, 0.83f)
                curveTo(21.3f, 8.48f, 21.16f, 8.39f, 21f, 8.31f)
                lineTo(19f, 13f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1.5f, -6.28f)
                curveTo(14.4f, 6.58f, 13.22f, 6.5f, 12f, 6.5f)
                reflectiveCurveTo(9.6f, 6.58f, 8.5f, 6.72f)
                lineTo(7f, 13f)
                horizontalLineTo(5f)
                lineTo(3f, 8.31f)
                curveTo(2.84f, 8.39f, 2.7f, 8.48f, 2.56f, 8.57f)
                curveTo(1.88f, 9f, 1f, 8.55f, 1f, 7.74f)
                verticalLineTo(4.25f)
                curveTo(1f, 1.9f, 5.92f, 0f, 12f, 0f)
                reflectiveCurveTo(23f, 1.9f, 23f, 4.25f)
                close()
                moveTo(6.9f, 6.98f)
                curveTo(5.97f, 7.17f, 5.12f, 7.41f, 4.37f, 7.69f)
                lineToRelative(1.51f, 3.55f)
                lineTo(6.9f, 6.98f)
                close()
                moveTo(19.63f, 7.69f)
                curveToRelative(-0.75f, -0.28f, -1.6f, -0.52f, -2.53f, -0.71f)
                lineToRelative(1.02f, 4.25f)
                lineTo(19.63f, 7.69f)
                close()
                moveTo(21f, 4.31f)
                curveTo(20.65f, 3.63f, 17.57f, 2f, 12f, 2f)
                reflectiveCurveTo(3.35f, 3.63f, 3f, 4.31f)
                verticalLineToRelative(1.77f)
                curveTo(5.34f, 5.07f, 8.56f, 4.5f, 12f, 4.5f)
                reflectiveCurveToRelative(6.66f, 0.57f, 9f, 1.58f)
                verticalLineTo(4.31f)
                close()
            }
        }.build()
        
        return _Paragliding!!
    }

private var _Paragliding: ImageVector? = null

