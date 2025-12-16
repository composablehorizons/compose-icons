package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LetterCaseLowercase: ImageVector
    get() {
        if (_LetterCaseLowercase != null) return _LetterCaseLowercase!!
        
        _LetterCaseLowercase = ImageVector.Builder(
            name = "letter-case-lowercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.69879f, 5.20702f)
                curveTo(4.59242f, 5.20702f, 5.4047f, 5.60212f, 5.95367f, 6.2246f)
                verticalLineTo(5.71972f)
                curveTo(5.95383f, 5.47132f, 6.15544f, 5.26952f, 6.40387f, 5.26952f)
                curveTo(6.65229f, 5.26954f, 6.85391f, 5.47133f, 6.85406f, 5.71972f)
                verticalLineTo(11.5293f)
                curveTo(6.85406f, 11.7778f, 6.65238f, 11.9795f, 6.40387f, 11.9795f)
                curveTo(6.15534f, 11.9795f, 5.95367f, 11.7778f, 5.95367f, 11.5293f)
                verticalLineTo(11.0195f)
                curveTo(5.37363f, 11.6676f, 4.52168f, 12.0127f, 3.69879f, 12.0127f)
                curveTo(2.15809f, 12.0126f, 0.809143f, 10.6333f, 0.809143f, 8.60937f)
                curveTo(0.809292f, 6.68556f, 2.0582f, 5.20711f, 3.69879f, 5.20702f)
                close()
                moveTo(10.7984f, 5.20702f)
                curveTo(11.6919f, 5.20702f, 12.5043f, 5.60223f, 13.0533f, 6.2246f)
                verticalLineTo(5.71972f)
                curveTo(13.0534f, 5.47158f, 13.2554f, 5.26995f, 13.5035f, 5.26952f)
                curveTo(13.7519f, 5.26952f, 13.9535f, 5.47132f, 13.9537f, 5.71972f)
                verticalLineTo(11.5293f)
                curveTo(13.9537f, 11.7778f, 13.752f, 11.9795f, 13.5035f, 11.9795f)
                curveTo(13.2553f, 11.9791f, 13.0533f, 11.7776f, 13.0533f, 11.5293f)
                verticalLineTo(11.0195f)
                curveTo(12.4732f, 11.6674f, 11.6212f, 12.0127f, 10.7984f, 12.0127f)
                curveTo(9.25786f, 12.0124f, 7.90875f, 10.6332f, 7.90875f, 8.60937f)
                curveTo(7.9089f, 6.68571f, 9.158f, 5.20734f, 10.7984f, 5.20702f)
                close()
                moveTo(3.88629f, 6.05761f)
                curveTo(2.90854f, 6.05789f, 1.83559f, 6.96599f, 1.83551f, 8.60937f)
                curveTo(1.83551f, 10.1529f, 2.80856f, 11.1608f, 3.88629f, 11.1611f)
                curveTo(4.77058f, 11.1611f, 5.57174f, 10.4926f, 5.95367f, 9.79491f)
                verticalLineTo(7.30566f)
                curveTo(5.56383f, 6.58334f, 4.74205f, 6.05761f, 3.88629f, 6.05761f)
                close()
                moveTo(10.9859f, 6.05761f)
                curveTo(10.0083f, 6.05813f, 8.9352f, 6.96621f, 8.93512f, 8.60937f)
                curveTo(8.93512f, 10.1527f, 9.90833f, 11.1606f, 10.9859f, 11.1611f)
                curveTo(11.8701f, 11.1611f, 12.6713f, 10.4926f, 13.0533f, 9.79491f)
                verticalLineTo(7.30566f)
                curveTo(12.6634f, 6.58343f, 11.8416f, 6.05761f, 10.9859f, 6.05761f)
                close()
            }
        }.build()
        
        return _LetterCaseLowercase!!
    }

private var _LetterCaseLowercase: ImageVector? = null

