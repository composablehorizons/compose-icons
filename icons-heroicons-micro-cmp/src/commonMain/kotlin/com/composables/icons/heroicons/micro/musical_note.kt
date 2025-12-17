package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.MusicalNote: ImageVector
    get() {
        if (_MusicalNote != null) return _MusicalNote!!
        
        _MusicalNote = ImageVector.Builder(
            name = "musical-note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.89f, -0.737f)
                lineToRelative(-7.502f, 1.43f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.61f, 0.736f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.018f, 0f, 0.036f, 0.002f, 0.054f)
                verticalLineTo(9.73f)
                arcToRelative(1f, 1f, 0f, false, true, -0.813f, 0.983f)
                lineToRelative(-0.58f, 0.11f)
                arcToRelative(1.978f, 1.978f, 0f, false, false, 0.741f, 3.886f)
                lineToRelative(0.603f, -0.115f)
                curveToRelative(0.9f, -0.171f, 1.55f, -0.957f, 1.55f, -1.873f)
                verticalLineToRelative(-1.543f)
                lineToRelative(-0.001f, -0.043f)
                verticalLineTo(6.3f)
                lineToRelative(6f, -1.143f)
                verticalLineToRelative(3.146f)
                arcToRelative(1f, 1f, 0f, false, true, -0.813f, 0.982f)
                lineToRelative(-0.584f, 0.111f)
                arcToRelative(1.978f, 1.978f, 0f, false, false, 0.74f, 3.886f)
                lineToRelative(0.326f, -0.062f)
                arcTo(2.252f, 2.252f, 0f, false, false, 14f, 11.007f)
                verticalLineTo(1.75f)
                close()
            }
        }.build()
        
        return _MusicalNote!!
    }

private var _MusicalNote: ImageVector? = null

