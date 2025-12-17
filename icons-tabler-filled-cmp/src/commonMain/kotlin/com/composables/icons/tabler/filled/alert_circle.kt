package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.AlertCircle: ImageVector
    get() {
        if (_AlertCircle != null) return _AlertCircle!!
        
        _AlertCircle = ImageVector.Builder(
            name = "alert-circle",
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
                moveToRelative(0.01f, 13f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveToRelative(-0.01f, -8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, false, 1.986f, 0f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-4f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, -0.883f)
                close()
            }
        }.build()
        
        return _AlertCircle!!
    }

private var _AlertCircle: ImageVector? = null

