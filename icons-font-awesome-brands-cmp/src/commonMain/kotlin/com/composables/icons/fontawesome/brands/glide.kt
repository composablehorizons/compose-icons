package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Glide: ImageVector
    get() {
        if (_Glide != null) return _Glide!!
        
        _Glide = ImageVector.Builder(
            name = "glide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(252.8f, 148.6f)
                curveToRelative(0f, 8.8f, -1.6f, 17.7f, -3.4f, 26.4f)
                curveToRelative(-5.8f, 27.8f, -11.6f, 55.8f, -17.3f, 83.6f)
                curveToRelative(-1.4f, 6.3f, -8.3f, 4.9f, -13.7f, 4.9f)
                curveToRelative(-23.8f, 0f, -30.5f, -26f, -30.5f, -45.5f)
                curveToRelative(0f, -29.3f, 11.2f, -68.1f, 38.5f, -83.1f)
                curveToRelative(4.3f, -2.5f, 9.2f, -4.2f, 14.1f, -4.2f)
                curveToRelative(11.4f, 0f, 12.3f, 8.3f, 12.3f, 17.9f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveToRelative(-64f, 187f)
                curveToRelative(0f, -5.1f, -20.8f, -37.7f, -25.5f, -39.5f)
                curveToRelative(-2.2f, -0.9f, -7.2f, -2.3f, -9.6f, -2.3f)
                curveToRelative(-23.1f, 0f, -38.7f, 10.5f, -58.2f, 21.5f)
                lineToRelative(-0.5f, -0.5f)
                curveToRelative(4.3f, -29.4f, 14.6f, -57.2f, 14.6f, -87.4f)
                curveToRelative(0f, -44.6f, -23.8f, -62.7f, -67.5f, -62.7f)
                curveToRelative(-71.7f, 0f, -108f, 70.8f, -108f, 123.5f)
                curveToRelative(0f, 54.7f, 32f, 85f, 86.3f, 85f)
                curveToRelative(7.5f, 0f, 6.9f, -0.6f, 6.9f, 2.3f)
                curveToRelative(-10.5f, 80.3f, -56.5f, 82.9f, -56.5f, 58.9f)
                curveToRelative(0f, -24.4f, 28f, -36.5f, 28.3f, -38f)
                curveToRelative(-0.2f, -7.6f, -29.3f, -17.2f, -36.7f, -17.2f)
                curveToRelative(-21.1f, 0f, -32.7f, 33f, -32.7f, 50.6f)
                curveToRelative(0f, 32.3f, 20.4f, 54.7f, 53.3f, 54.7f)
                curveToRelative(48.2f, 0f, 83.4f, -49.7f, 94.3f, -91.7f)
                curveToRelative(9.4f, -37.7f, 7f, -39.4f, 12.3f, -42.1f)
                curveToRelative(20f, -10.1f, 35.8f, -16.8f, 58.4f, -16.8f)
                curveToRelative(11.1f, 0f, 19f, 2.3f, 36.7f, 5.2f)
                curveToRelative(1.8f, 0.1f, 4.1f, -1.7f, 4.1f, -3.5f)
                close()
            }
        }.build()
        
        return _Glide!!
    }

private var _Glide: ImageVector? = null

