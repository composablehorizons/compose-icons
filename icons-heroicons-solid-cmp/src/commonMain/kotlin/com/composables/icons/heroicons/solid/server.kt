package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.08f, 5.227f)
                arcTo(3f, 3f, 0f, false, true, 6.979f, 3f)
                horizontalLineTo(17.02f)
                arcToRelative(3f, 3f, 0f, false, true, 2.9f, 2.227f)
                lineToRelative(2.113f, 7.926f)
                arcTo(5.228f, 5.228f, 0f, false, false, 18.75f, 12f)
                horizontalLineTo(5.25f)
                arcToRelative(5.228f, 5.228f, 0f, false, false, -3.284f, 1.153f)
                lineTo(4.08f, 5.227f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.25f, 13.5f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, 7.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, -7.5f)
                horizontalLineTo(5.25f)
                close()
                moveToRelative(10.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveToRelative(3.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

