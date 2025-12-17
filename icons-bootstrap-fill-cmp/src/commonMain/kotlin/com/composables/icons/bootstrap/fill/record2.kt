package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Record2: ImageVector
    get() {
        if (_Record2 != null) return _Record2!!
        
        _Record2 = ImageVector.Builder(
            name = "record2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 13f)
                arcTo(5f, 5f, 0f, true, false, 8f, 3f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, 10f)
                moveToRelative(0f, -2f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
            }
        }.build()
        
        return _Record2!!
    }

private var _Record2: ImageVector? = null

