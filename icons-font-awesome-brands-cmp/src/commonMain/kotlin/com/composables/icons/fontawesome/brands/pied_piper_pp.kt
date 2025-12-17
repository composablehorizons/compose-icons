package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.PiedPiperPp: ImageVector
    get() {
        if (_PiedPiperPp != null) return _PiedPiperPp!!
        
        _PiedPiperPp = ImageVector.Builder(
            name = "pied-piper-pp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(205.3f, 174.6f)
                curveToRelative(0f, 21.1f, -14.2f, 38.1f, -31.7f, 38.1f)
                curveToRelative(-7.1f, 0f, -12.8f, -1.2f, -17.2f, -3.7f)
                verticalLineToRelative(-68f)
                curveToRelative(4.4f, -2.7f, 10.1f, -4.2f, 17.2f, -4.2f)
                curveToRelative(17.5f, 0f, 31.7f, 16.9f, 31.7f, 37.8f)
                close()
                moveToRelative(52.6f, 67f)
                curveToRelative(-7.1f, 0f, -12.8f, 1.5f, -17.2f, 4.2f)
                verticalLineToRelative(68f)
                curveToRelative(4.4f, 2.5f, 10.1f, 3.7f, 17.2f, 3.7f)
                curveToRelative(17.4f, 0f, 31.7f, -16.9f, 31.7f, -37.8f)
                curveToRelative(0f, -21.1f, -14.3f, -38.1f, -31.7f, -38.1f)
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
                moveTo(185f, 255.1f)
                curveToRelative(41f, 0f, 74.2f, -35.6f, 74.2f, -79.6f)
                curveToRelative(0f, -44f, -33.2f, -79.6f, -74.2f, -79.6f)
                curveToRelative(-12f, 0f, -24.1f, 3.2f, -34.6f, 8.8f)
                horizontalLineToRelative(-45.7f)
                verticalLineTo(311f)
                lineToRelative(51.8f, -10.1f)
                verticalLineToRelative(-50.6f)
                curveToRelative(8.6f, 3.1f, 18.1f, 4.8f, 28.5f, 4.8f)
                close()
                moveToRelative(158.4f, 25.3f)
                curveToRelative(0f, -44f, -33.2f, -79.6f, -73.9f, -79.6f)
                curveToRelative(-3.2f, 0f, -6.4f, 0.2f, -9.6f, 0.7f)
                curveToRelative(-3.7f, 12.5f, -10.1f, 23.8f, -19.2f, 33.4f)
                curveToRelative(-13.8f, 15f, -32.2f, 23.8f, -51.8f, 24.8f)
                verticalLineTo(416f)
                lineToRelative(51.8f, -10.1f)
                verticalLineToRelative(-50.6f)
                curveToRelative(8.6f, 3.2f, 18.2f, 4.7f, 28.7f, 4.7f)
                curveToRelative(40.8f, 0f, 74f, -35.6f, 74f, -79.6f)
                close()
            }
        }.build()
        
        return _PiedPiperPp!!
    }

private var _PiedPiperPp: ImageVector? = null

