package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Copyright: ImageVector
    get() {
        if (_Copyright != null) return _Copyright!!
        
        _Copyright = ImageVector.Builder(
            name = "copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                close()
                moveToRelative(-2.34f, 5.659f)
                arcToRelative(4.016f, 4.016f, 0f, false, false, -5.543f, 0.23f)
                arcToRelative(3.993f, 3.993f, 0f, false, false, 0f, 5.542f)
                arcToRelative(4.016f, 4.016f, 0f, false, false, 5.543f, 0.23f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, -1.502f)
                curveToRelative(-0.81f, 0.711f, -2.035f, 0.66f, -2.783f, -0.116f)
                arcToRelative(1.993f, 1.993f, 0f, false, true, 0f, -2.766f)
                arcToRelative(2.016f, 2.016f, 0f, false, true, 2.783f, -0.116f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -1.501f)
                close()
            }
        }.build()
        
        return _Copyright!!
    }

private var _Copyright: ImageVector? = null

