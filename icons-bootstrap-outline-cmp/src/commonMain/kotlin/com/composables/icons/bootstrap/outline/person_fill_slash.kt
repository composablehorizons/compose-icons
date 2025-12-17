package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonFillSlash: ImageVector
    get() {
        if (_PersonFillSlash != null) return _PersonFillSlash!!
        
        _PersonFillSlash = ImageVector.Builder(
            name = "person-fill-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.879f, 10.414f)
                arcToRelative(2.501f, 2.501f, 0f, false, false, -3.465f, 3.465f)
                close()
                moveToRelative(0.707f, 0.707f)
                lineToRelative(-3.465f, 3.465f)
                arcToRelative(2.501f, 2.501f, 0f, false, false, 3.465f, -3.465f)
                moveToRelative(-4.56f, -1.096f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 4.949f, 4.95f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.95f, -4.95f)
                close()
                moveTo(11f, 5f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                moveToRelative(-9f, 8f)
                curveToRelative(0f, 1f, 1f, 1f, 1f, 1f)
                horizontalLineToRelative(5.256f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.544f, -3.393f)
                quadTo(8.844f, 9.002f, 8f, 9f)
                curveToRelative(-5f, 0f, -6f, 3f, -6f, 4f)
            }
        }.build()
        
        return _PersonFillSlash!!
    }

private var _PersonFillSlash: ImageVector? = null

