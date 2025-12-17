package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Microphone: ImageVector
    get() {
        if (_Microphone != null) return _Microphone!!
        
        _Microphone = ImageVector.Builder(
            name = "microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12f, 18.75f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-1.5f)
                moveToRelative(-6f, 7.5f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineToRelative(-1.5f)
                moveToRelative(6f, 7.5f)
                verticalLineToRelative(3.75f)
                moveToRelative(-3.75f, 0f)
                horizontalLineToRelative(7.5f)
                moveTo(12f, 15.75f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(4.5f)
                arcToRelative(3f, 3f, 0f, true, true, 6f, 0f)
                verticalLineToRelative(8.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                close()
            }
        }.build()
        
        return _Microphone!!
    }

private var _Microphone: ImageVector? = null

