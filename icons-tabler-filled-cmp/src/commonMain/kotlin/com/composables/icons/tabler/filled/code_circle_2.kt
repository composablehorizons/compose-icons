package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CodeCircle2: ImageVector
    get() {
        if (_CodeCircle2 != null) return _CodeCircle2!!
        
        _CodeCircle2 = ImageVector.Builder(
            name = "code-circle-2",
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
                moveToRelative(-3.658f, 5.22f)
                arcToRelative(1f, 1f, 0f, false, false, -1.282f, 0.598f)
                lineToRelative(-2f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1.88f, 0.684f)
                lineToRelative(2f, -5.5f)
                arcToRelative(1f, 1f, 0f, false, false, -0.598f, -1.282f)
                moveToRelative(-4.135f, 1.233f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.793f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                moveToRelative(7f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0.083f, 1.32f)
                lineToRelative(0.792f, 0.793f)
                lineToRelative(-0.792f, 0.793f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                close()
            }
        }.build()
        
        return _CodeCircle2!!
    }

private var _CodeCircle2: ImageVector? = null

