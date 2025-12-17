package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Atom2: ImageVector
    get() {
        if (_Atom2 != null) return _Atom2!!
        
        _Atom2 = ImageVector.Builder(
            name = "atom-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, true, true, -3.995f, 4.2f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.89f, 12.006f)
                arcToRelative(1f, 1f, 0f, false, true, 1.104f, 0.884f)
                arcToRelative(8f, 8f, 0f, false, false, 4.444f, 6.311f)
                arcToRelative(1f, 1f, 0f, true, true, -0.876f, 1.799f)
                arcToRelative(10f, 10f, 0f, false, true, -5.556f, -7.89f)
                arcToRelative(1f, 1f, 0f, false, true, 0.884f, -1.103f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.993f, 12f)
                lineToRelative(0.117f, 0.006f)
                arcToRelative(1f, 1f, 0f, false, true, 0.884f, 1.104f)
                arcToRelative(10f, 10f, 0f, false, true, -5.556f, 7.889f)
                arcToRelative(1f, 1f, 0f, true, true, -0.876f, -1.798f)
                arcToRelative(8f, 8f, 0f, false, false, 4.444f, -6.31f)
                arcToRelative(1f, 1f, 0f, false, true, 0.987f, -0.891f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.567f, 4.226f)
                arcToRelative(10f, 10f, 0f, false, true, 12.666f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -1.266f, 1.548f)
                arcToRelative(8f, 8f, 0f, false, false, -10.134f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -1.266f, -1.548f)
                close()
            }
        }.build()
        
        return _Atom2!!
    }

private var _Atom2: ImageVector? = null

