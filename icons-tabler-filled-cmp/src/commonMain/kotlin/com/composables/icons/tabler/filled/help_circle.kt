package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.HelpCircle: ImageVector
    get() {
        if (_HelpCircle != null) return _HelpCircle!!
        
        _HelpCircle = ImageVector.Builder(
            name = "help-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                arcToRelative(10f, 10f, 0f, false, true, -19.995f, 0.324f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                close()
                moveToRelative(0f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
                moveToRelative(1.368f, -6.673f)
                arcToRelative(2.98f, 2.98f, 0f, false, false, -3.631f, 0.728f)
                arcToRelative(1f, 1f, 0f, false, false, 1.44f, 1.383f)
                lineToRelative(0.171f, -0.18f)
                arcToRelative(0.98f, 0.98f, 0f, false, true, 1.11f, -0.15f)
                arcToRelative(1f, 1f, 0f, false, true, -0.34f, 1.886f)
                lineToRelative(-0.232f, 0.012f)
                arcToRelative(1f, 1f, 0f, false, false, 0.111f, 1.994f)
                arcToRelative(3f, 3f, 0f, false, false, 1.371f, -5.673f)
                close()
            }
        }.build()
        
        return _HelpCircle!!
    }

private var _HelpCircle: ImageVector? = null

