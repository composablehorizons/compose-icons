package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LetterCaseCapitalize: ImageVector
    get() {
        if (_LetterCaseCapitalize != null) return _LetterCaseCapitalize!!
        
        _LetterCaseCapitalize = ImageVector.Builder(
            name = "letter-case-capitalize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.68946f, 2.75f)
                curveTo(3.89633f, 2.74979f, 4.08178f, 2.87732f, 4.15626f, 3.07031f)
                lineTo(7.36622f, 11.3896f)
                lineTo(7.39356f, 11.4873f)
                curveTo(7.43224f, 11.7167f, 7.30549f, 11.9491f, 7.08009f, 12.0361f)
                curveTo(6.8546f, 12.1231f, 6.60494f, 12.0358f, 6.4795f, 11.8398f)
                lineTo(6.4336f, 11.75f)
                lineTo(5.38282f, 9.02539f)
                horizontalLineTo(2.01075f)
                lineTo(0.966806f, 11.749f)
                lineTo(0.920908f, 11.8398f)
                curveTo(0.795759f, 12.0354f, 0.546617f, 12.1233f, 0.321299f, 12.0371f)
                curveTo(0.0635625f, 11.9382f, -0.0655997f, 11.6484f, 0.0332127f, 11.3906f)
                lineTo(3.22364f, 3.07129f)
                lineTo(3.25587f, 3.00195f)
                curveTo(3.34371f, 2.84806f, 3.50847f, 2.75031f, 3.68946f, 2.75f)
                close()
                moveTo(10.8984f, 5.20703f)
                curveTo(11.792f, 5.20703f, 12.6044f, 5.60223f, 13.1533f, 6.22461f)
                verticalLineTo(5.71973f)
                curveTo(13.1535f, 5.47158f, 13.3554f, 5.26994f, 13.6035f, 5.26953f)
                curveTo(13.852f, 5.26953f, 14.0536f, 5.47132f, 14.0537f, 5.71973f)
                verticalLineTo(11.5293f)
                curveTo(14.0537f, 11.7778f, 13.8521f, 11.9795f, 13.6035f, 11.9795f)
                curveTo(13.3553f, 11.9791f, 13.1533f, 11.7776f, 13.1533f, 11.5293f)
                verticalLineTo(11.0195f)
                curveTo(12.5733f, 11.6675f, 11.7213f, 12.0127f, 10.8984f, 12.0127f)
                curveTo(9.3579f, 12.0124f, 8.0088f, 10.6332f, 8.0088f, 8.60938f)
                curveTo(8.00895f, 6.68571f, 9.25803f, 5.20734f, 10.8984f, 5.20703f)
                close()
                moveTo(11.0859f, 6.05762f)
                curveTo(10.1083f, 6.05812f, 9.03524f, 6.96621f, 9.03517f, 8.60938f)
                curveTo(9.03517f, 10.1527f, 10.0084f, 11.1606f, 11.0859f, 11.1611f)
                curveTo(11.9702f, 11.1611f, 12.7714f, 10.4926f, 13.1533f, 9.79492f)
                verticalLineTo(7.30566f)
                curveTo(12.7635f, 6.58343f, 11.9416f, 6.05762f, 11.0859f, 6.05762f)
                close()
                moveTo(2.33692f, 8.17578f)
                horizontalLineTo(5.0547f)
                lineTo(3.69142f, 4.64258f)
                lineTo(2.33692f, 8.17578f)
                close()
            }
        }.build()
        
        return _LetterCaseCapitalize!!
    }

private var _LetterCaseCapitalize: ImageVector? = null

