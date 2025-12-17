package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) return _ShieldCheck!!
        
        _ShieldCheck = ImageVector.Builder(
            name = "shield-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 1.709f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1f, 0f)
                arcToRelative(8.963f, 8.963f, 0f, false, true, -4.84f, 2.217f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.654f, 0.72f)
                arcToRelative(10.499f, 10.499f, 0f, false, false, 5.647f, 9.672f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.694f, -0.001f)
                arcToRelative(10.499f, 10.499f, 0f, false, false, 5.647f, -9.672f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.654f, -0.719f)
                arcTo(8.963f, 8.963f, 0f, false, true, 8.5f, 1.71f)
                close()
                moveToRelative(2.34f, 5.504f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.18f, -0.926f)
                lineTo(7.394f, 9.17f)
                lineToRelative(-1.156f, -0.99f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.976f, 1.138f)
                lineToRelative(1.75f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.078f, -0.106f)
                lineToRelative(2.75f, -3.5f)
                close()
            }
        }.build()
        
        return _ShieldCheck!!
    }

private var _ShieldCheck: ImageVector? = null

