package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GenderMale: ImageVector
    get() {
        if (_GenderMale != null) return _GenderMale!!
        
        _GenderMale = ImageVector.Builder(
            name = "gender-male",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2.707f)
                lineTo(9.871f, 6.836f)
                arcToRelative(5f, 5f, 0f, true, true, -0.707f, -0.707f)
                lineTo(13.293f, 2f)
                close()
                moveTo(6f, 6f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
            }
        }.build()
        
        return _GenderMale!!
    }

private var _GenderMale: ImageVector? = null

