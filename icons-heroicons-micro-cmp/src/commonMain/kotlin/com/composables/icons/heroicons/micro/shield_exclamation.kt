package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ShieldExclamation: ImageVector
    get() {
        if (_ShieldExclamation != null) return _ShieldExclamation!!
        
        _ShieldExclamation = ImageVector.Builder(
            name = "shield-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1.709f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1f, 0f)
                arcToRelative(8.963f, 8.963f, 0f, false, false, 4.84f, 2.217f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.654f, 0.72f)
                arcToRelative(10.499f, 10.499f, 0f, false, true, -5.647f, 9.672f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.694f, -0.001f)
                arcToRelative(10.499f, 10.499f, 0f, false, true, -5.647f, -9.672f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.654f, -0.719f)
                arcTo(8.963f, 8.963f, 0f, false, false, 7.5f, 1.71f)
                close()
                moveTo(8f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 5f)
                close()
                moveToRelative(0f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ShieldExclamation!!
    }

private var _ShieldExclamation: ImageVector? = null

