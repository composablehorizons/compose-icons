package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) return _Sparkles!!
        
        _Sparkles = ImageVector.Builder(
            name = "sparkles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.98f, 1.804f)
                arcToRelative(1f, 1f, 0f, false, false, -1.96f, 0f)
                lineToRelative(-0.24f, 1.192f)
                arcToRelative(1f, 1f, 0f, false, true, -0.784f, 0.785f)
                lineToRelative(-1.192f, 0.238f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.962f)
                lineToRelative(1.192f, 0.238f)
                arcToRelative(1f, 1f, 0f, false, true, 0.785f, 0.785f)
                lineToRelative(0.238f, 1.192f)
                arcToRelative(1f, 1f, 0f, false, false, 1.962f, 0f)
                lineToRelative(0.238f, -1.192f)
                arcToRelative(1f, 1f, 0f, false, true, 0.785f, -0.785f)
                lineToRelative(1.192f, -0.238f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.962f)
                lineToRelative(-1.192f, -0.238f)
                arcToRelative(1f, 1f, 0f, false, true, -0.785f, -0.785f)
                lineToRelative(-0.238f, -1.192f)
                close()
                moveTo(6.949f, 5.684f)
                arcToRelative(1f, 1f, 0f, false, false, -1.898f, 0f)
                lineToRelative(-0.683f, 2.051f)
                arcToRelative(1f, 1f, 0f, false, true, -0.633f, 0.633f)
                lineToRelative(-2.051f, 0.683f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.898f)
                lineToRelative(2.051f, 0.684f)
                arcToRelative(1f, 1f, 0f, false, true, 0.633f, 0.632f)
                lineToRelative(0.683f, 2.051f)
                arcToRelative(1f, 1f, 0f, false, false, 1.898f, 0f)
                lineToRelative(0.683f, -2.051f)
                arcToRelative(1f, 1f, 0f, false, true, 0.633f, -0.633f)
                lineToRelative(2.051f, -0.683f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.898f)
                lineToRelative(-2.051f, -0.683f)
                arcToRelative(1f, 1f, 0f, false, true, -0.633f, -0.633f)
                lineTo(6.95f, 5.684f)
                close()
                moveTo(13.949f, 13.684f)
                arcToRelative(1f, 1f, 0f, false, false, -1.898f, 0f)
                lineToRelative(-0.184f, 0.551f)
                arcToRelative(1f, 1f, 0f, false, true, -0.632f, 0.633f)
                lineToRelative(-0.551f, 0.183f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.898f)
                lineToRelative(0.551f, 0.183f)
                arcToRelative(1f, 1f, 0f, false, true, 0.633f, 0.633f)
                lineToRelative(0.183f, 0.551f)
                arcToRelative(1f, 1f, 0f, false, false, 1.898f, 0f)
                lineToRelative(0.184f, -0.551f)
                arcToRelative(1f, 1f, 0f, false, true, 0.632f, -0.633f)
                lineToRelative(0.551f, -0.183f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.898f)
                lineToRelative(-0.551f, -0.184f)
                arcToRelative(1f, 1f, 0f, false, true, -0.633f, -0.632f)
                lineToRelative(-0.183f, -0.551f)
                close()
            }
        }.build()
        
        return _Sparkles!!
    }

private var _Sparkles: ImageVector? = null

