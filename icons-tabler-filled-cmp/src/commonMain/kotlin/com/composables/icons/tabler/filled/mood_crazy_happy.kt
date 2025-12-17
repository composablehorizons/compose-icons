package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MoodCrazyHappy: ImageVector
    get() {
        if (_MoodCrazyHappy != null) return _MoodCrazyHappy!!
        
        _MoodCrazyHappy = ImageVector.Builder(
            name = "mood-crazy-happy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(-1.8f, 10.946f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.572f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 6.428f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -0.014f, -1.414f)
                moveToRelative(-7.493f, -6.493f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 1.414f)
                lineToRelative(0.792f, 0.793f)
                lineToRelative(-0.792f, 0.793f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(0.793f, -0.792f)
                lineToRelative(0.793f, 0.792f)
                arcToRelative(1f, 1f, 0f, true, false, 1.414f, -1.414f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.793f)
                arcToRelative(1f, 1f, 0f, true, false, -1.414f, -1.414f)
                lineToRelative(-0.793f, 0.792f)
                close()
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 1.414f)
                lineToRelative(0.792f, 0.793f)
                lineToRelative(-0.792f, 0.793f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(0.793f, -0.792f)
                lineToRelative(0.793f, 0.792f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.793f)
                arcToRelative(1f, 1f, 0f, true, false, -1.414f, -1.414f)
                lineToRelative(-0.793f, 0.792f)
                close()
            }
        }.build()
        
        return _MoodCrazyHappy!!
    }

private var _MoodCrazyHappy: ImageVector? = null

