package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GenderNeuter: ImageVector
    get() {
        if (_GenderNeuter != null) return _GenderNeuter!!
        
        _GenderNeuter = ImageVector.Builder(
            name = "gender-neuter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
                moveTo(3f, 5f)
                arcToRelative(5f, 5f, 0f, true, true, 5.5f, 4.975f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(9.975f)
                arcTo(5f, 5f, 0f, false, true, 3f, 5f)
            }
        }.build()
        
        return _GenderNeuter!!
    }

private var _GenderNeuter: ImageVector? = null

