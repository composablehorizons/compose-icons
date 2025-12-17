package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Record: ImageVector
    get() {
        if (_Record != null) return _Record!!
        
        _Record = ImageVector.Builder(
            name = "record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                moveToRelative(0f, 1f)
                arcTo(5f, 5f, 0f, true, false, 8f, 3f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, 10f)
            }
        }.build()
        
        return _Record!!
    }

private var _Record: ImageVector? = null

