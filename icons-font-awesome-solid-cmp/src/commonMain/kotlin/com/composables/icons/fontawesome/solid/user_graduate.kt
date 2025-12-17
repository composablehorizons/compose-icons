package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserGraduate: ImageVector
    get() {
        if (_UserGraduate != null) return _UserGraduate!!
        
        _UserGraduate = ImageVector.Builder(
            name = "user-graduate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(319.4f, 320.6f)
                lineTo(224f, 416f)
                lineToRelative(-95.4f, -95.4f)
                curveTo(57.1f, 323.7f, 0f, 382.2f, 0f, 454.4f)
                verticalLineToRelative(9.6f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-9.6f)
                curveToRelative(0f, -72.2f, -57.1f, -130.7f, -128.6f, -133.8f)
                close()
                moveTo(13.6f, 79.8f)
                lineToRelative(6.4f, 1.5f)
                verticalLineToRelative(58.4f)
                curveToRelative(-7f, 4.2f, -12f, 11.5f, -12f, 20.3f)
                curveToRelative(0f, 8.4f, 4.6f, 15.4f, 11.1f, 19.7f)
                lineTo(3.5f, 242f)
                curveToRelative(-1.7f, 6.9f, 2.1f, 14f, 7.6f, 14f)
                horizontalLineToRelative(41.8f)
                curveToRelative(5.5f, 0f, 9.3f, -7.1f, 7.6f, -14f)
                lineToRelative(-15.6f, -62.3f)
                curveTo(51.4f, 175.4f, 56f, 168.4f, 56f, 160f)
                curveToRelative(0f, -8.8f, -5f, -16.1f, -12f, -20.3f)
                verticalLineTo(87.1f)
                lineToRelative(66f, 15.9f)
                curveToRelative(-8.6f, 17.2f, -14f, 36.4f, -14f, 57f)
                curveToRelative(0f, 70.7f, 57.3f, 128f, 128f, 128f)
                reflectiveCurveToRelative(128f, -57.3f, 128f, -128f)
                curveToRelative(0f, -20.6f, -5.3f, -39.8f, -14f, -57f)
                lineToRelative(96.3f, -23.2f)
                curveToRelative(18.2f, -4.4f, 18.2f, -27.1f, 0f, -31.5f)
                lineToRelative(-190.4f, -46f)
                curveToRelative(-13f, -3.1f, -26.7f, -3.1f, -39.7f, 0f)
                lineTo(13.6f, 48.2f)
                curveToRelative(-18.1f, 4.4f, -18.1f, 27.2f, 0f, 31.6f)
                close()
            }
        }.build()
        
        return _UserGraduate!!
    }

private var _UserGraduate: ImageVector? = null

