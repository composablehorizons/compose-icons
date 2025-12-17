package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bandage: ImageVector
    get() {
        if (_Bandage != null) return _Bandage!!
        
        _Bandage = ImageVector.Builder(
            name = "bandage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.207f, 3.793f)
                arcToRelative(5.95f, 5.95f, 0f, false, true, 0.179f, 8.228f)
                lineToRelative(-0.179f, 0.186f)
                lineToRelative(-8f, 8f)
                arcToRelative(5.95f, 5.95f, 0f, false, true, -8.593f, -8.228f)
                lineToRelative(0.179f, -0.186f)
                lineToRelative(8f, -8f)
                arcToRelative(5.95f, 5.95f, 0f, false, true, 8.414f, 0f)
                close()
                moveToRelative(-8.207f, 9.207f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(2f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(-4f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(2f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _Bandage!!
    }

private var _Bandage: ImageVector? = null

