package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.GiftTop: ImageVector
    get() {
        if (_GiftTop != null) return _GiftTop!!
        
        _GiftTop = ImageVector.Builder(
            name = "gift-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.25f, 3f)
                verticalLineToRelative(4.046f)
                arcToRelative(3f, 3f, 0f, false, false, -4.277f, 4.204f)
                horizontalLineTo(1.5f)
                verticalLineToRelative(-6f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.75f, 3f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(12.75f, 3f)
                verticalLineToRelative(4.011f)
                arcToRelative(3f, 3f, 0f, false, true, 4.239f, 4.239f)
                horizontalLineTo(22.5f)
                verticalLineToRelative(-6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 20.25f, 3f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(22.5f, 12.75f)
                horizontalLineToRelative(-8.983f)
                arcToRelative(4.125f, 4.125f, 0f, false, false, 4.108f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                arcToRelative(5.623f, 5.623f, 0f, false, true, -4.875f, -2.817f)
                verticalLineTo(21f)
                horizontalLineToRelative(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11.25f, 21f)
                verticalLineToRelative(-5.817f)
                arcTo(5.623f, 5.623f, 0f, false, true, 6.375f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                arcToRelative(4.126f, 4.126f, 0f, false, false, 4.108f, -3.75f)
                horizontalLineTo(1.5f)
                verticalLineToRelative(6f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.75f, 21f)
                horizontalLineToRelative(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.085f, 10.354f)
                curveToRelative(0.03f, 0.297f, 0.038f, 0.575f, 0.036f, 0.805f)
                arcToRelative(7.484f, 7.484f, 0f, false, true, -0.805f, -0.036f)
                curveToRelative(-0.833f, -0.084f, -1.677f, -0.325f, -2.195f, -0.843f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.122f, -2.12f)
                curveToRelative(0.517f, 0.517f, 0.759f, 1.36f, 0.842f, 2.194f)
                close()
                moveTo(12.877f, 10.354f)
                curveToRelative(-0.03f, 0.297f, -0.038f, 0.575f, -0.036f, 0.805f)
                curveToRelative(0.23f, 0.002f, 0.508f, -0.006f, 0.805f, -0.036f)
                curveToRelative(0.833f, -0.084f, 1.677f, -0.325f, 2.195f, -0.843f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.72f, 8.16f)
                curveToRelative(-0.518f, 0.518f, -0.76f, 1.362f, -0.843f, 2.194f)
                close()
            }
        }.build()
        
        return _GiftTop!!
    }

private var _GiftTop: ImageVector? = null

