package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Fonticons: ImageVector
    get() {
        if (_Fonticons != null) return _Fonticons!!
        
        _Fonticons = ImageVector.Builder(
            name = "fonticons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(448f)
                verticalLineTo(32f)
                close()
                moveToRelative(187f, 140.9f)
                curveToRelative(-18.4f, 0f, -19f, 9.9f, -19f, 27.4f)
                verticalLineToRelative(23.3f)
                curveToRelative(0f, 2.4f, -3.5f, 4.4f, -0.6f, 4.4f)
                horizontalLineToRelative(67.4f)
                lineToRelative(-11.1f, 37.3f)
                horizontalLineTo(168f)
                verticalLineToRelative(112.9f)
                curveToRelative(0f, 5.8f, -2f, 6.7f, 3.2f, 7.3f)
                lineToRelative(43.5f, 4.1f)
                verticalLineToRelative(25.1f)
                horizontalLineTo(84f)
                verticalLineTo(389f)
                lineToRelative(21.3f, -2f)
                curveToRelative(5.2f, -0.6f, 6.7f, -2.3f, 6.7f, -7.9f)
                verticalLineTo(267.7f)
                curveToRelative(0f, -2.3f, -2.9f, -2.3f, -5.8f, -2.3f)
                horizontalLineTo(84f)
                verticalLineTo(228f)
                horizontalLineToRelative(28f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -49.6f, 26.5f, -70f, 77.3f, -70f)
                curveToRelative(34.1f, 0f, 64.7f, 8.2f, 64.7f, 52.8f)
                lineToRelative(-50.7f, 6.1f)
                curveToRelative(0.3f, -18.7f, -4.4f, -23f, -16.3f, -23f)
                close()
                moveToRelative(74.3f, 241.8f)
                verticalLineToRelative(-25.1f)
                lineToRelative(20.4f, -2.6f)
                curveToRelative(5.2f, -0.6f, 7.6f, -1.7f, 7.6f, -7.3f)
                verticalLineTo(271.8f)
                curveToRelative(0f, -4.1f, -2.9f, -6.7f, -6.7f, -7.9f)
                lineToRelative(-24.2f, -6.4f)
                lineToRelative(6.7f, -29.5f)
                horizontalLineToRelative(80.2f)
                verticalLineToRelative(151.7f)
                curveToRelative(0f, 5.8f, -2.6f, 6.4f, 2.9f, 7.3f)
                lineToRelative(15.7f, 2.6f)
                verticalLineToRelative(25.1f)
                close()
                moveToRelative(80.8f, -255.5f)
                lineToRelative(9f, 33.2f)
                lineToRelative(-7.3f, 7.3f)
                lineToRelative(-31.2f, -16.6f)
                lineToRelative(-31.2f, 16.6f)
                lineToRelative(-7.3f, -7.3f)
                lineToRelative(9f, -33.2f)
                lineToRelative(-21.8f, -24.2f)
                lineToRelative(3.5f, -9.6f)
                horizontalLineToRelative(27.7f)
                lineToRelative(15.5f, -28f)
                horizontalLineToRelative(9.3f)
                lineToRelative(15.5f, 28f)
                horizontalLineToRelative(27.7f)
                lineToRelative(3.5f, 9.6f)
                close()
            }
        }.build()
        
        return _Fonticons!!
    }

private var _Fonticons: ImageVector? = null

