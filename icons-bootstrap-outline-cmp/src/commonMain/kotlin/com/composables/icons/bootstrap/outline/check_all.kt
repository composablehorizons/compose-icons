package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CheckAll: ImageVector
    get() {
        if (_CheckAll != null) return _CheckAll!!
        
        _CheckAll = ImageVector.Builder(
            name = "check-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.97f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.07f, 1.05f)
                lineToRelative(-3.99f, 4.99f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.08f, 0.02f)
                lineTo(2.324f, 8.384f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.094f, 2.093f)
                lineTo(8.95f, 4.992f)
                close()
                moveToRelative(-0.92f, 5.14f)
                lineToRelative(0.92f, 0.92f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.079f, -0.02f)
                lineToRelative(3.992f, -4.99f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.091f, -1.028f)
                lineTo(9.477f, 9.417f)
                lineToRelative(-0.485f, -0.486f)
                close()
            }
        }.build()
        
        return _CheckAll!!
    }

private var _CheckAll: ImageVector? = null

