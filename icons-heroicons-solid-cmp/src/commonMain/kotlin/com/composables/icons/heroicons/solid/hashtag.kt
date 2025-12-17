package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) return _Hashtag!!
        
        _Hashtag = ImageVector.Builder(
            name = "hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.097f, 1.515f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.589f, 0.882f)
                lineTo(10.666f, 7.5f)
                horizontalLineToRelative(4.47f)
                lineToRelative(1.079f, -5.397f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.47f, 0.294f)
                lineTo(16.665f, 7.5f)
                horizontalLineToRelative(3.585f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.885f)
                lineToRelative(-1.2f, 6f)
                horizontalLineToRelative(3.585f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-3.885f)
                lineToRelative(-1.08f, 5.397f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.47f, -0.294f)
                lineToRelative(1.02f, -5.103f)
                horizontalLineToRelative(-4.47f)
                lineToRelative(-1.08f, 5.397f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.47f, -0.294f)
                lineToRelative(1.02f, -5.103f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3.885f)
                lineToRelative(1.2f, -6f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3.885f)
                lineToRelative(1.08f, -5.397f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.882f, -0.588f)
                close()
                moveTo(10.365f, 9f)
                lineToRelative(-1.2f, 6f)
                horizontalLineToRelative(4.47f)
                lineToRelative(1.2f, -6f)
                horizontalLineToRelative(-4.47f)
                close()
            }
        }.build()
        
        return _Hashtag!!
    }

private var _Hashtag: ImageVector? = null

