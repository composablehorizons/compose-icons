package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Image_search: ImageVector
    get() {
        if (_Image_search != null) return _Image_search!!
        
        _Image_search = ImageVector.Builder(
            name = "image_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.7f, 11.53f)
                curveToRelative(-0.7f, 0.31f, -1.45f, 0.47f, -2.21f, 0.47f)
                curveTo(12.46f, 12f, 10f, 9.53f, 10f, 6.5f)
                curveToRelative(0f, -0.17f, 0.01f, -0.34f, 0.03f, -0.5f)
                horizontalLineTo(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-8.17f)
                lineToRelative(-0.3f, -0.3f)
                close()
                moveTo(5.5f, 18f)
                lineToRelative(2.75f, -3.53f)
                lineToRelative(1.96f, 2.36f)
                lineToRelative(2.75f, -3.54f)
                lineTo(16.5f, 18f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.21f, 16.83f)
                lineToRelative(-1.96f, -2.36f)
                lineTo(5.5f, 18f)
                horizontalLineToRelative(11f)
                lineToRelative(-3.54f, -4.71f)
                close()
                moveTo(20f, 6.5f)
                curveTo(20f, 4.01f, 17.99f, 2f, 15.5f, 2f)
                reflectiveCurveTo(11f, 4.01f, 11f, 6.5f)
                reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineTo(21f, 13.42f)
                lineTo(22.42f, 12f)
                lineTo(19.3f, 8.89f)
                curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                close()
                moveTo(15.5f, 9f)
                curveTo(14.12f, 9f, 13f, 7.88f, 13f, 6.5f)
                reflectiveCurveTo(14.12f, 4f, 15.5f, 4f)
                reflectiveCurveTo(18f, 5.12f, 18f, 6.5f)
                reflectiveCurveTo(16.88f, 9f, 15.5f, 9f)
                close()
                moveTo(18f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.06f, -0.72f, 0.27f, -1.39f, 0.58f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6.17f)
                lineToRelative(-2f, -2f)
                verticalLineTo(20f)
                close()
            }
        }.build()
        
        return _Image_search!!
    }

private var _Image_search: ImageVector? = null

