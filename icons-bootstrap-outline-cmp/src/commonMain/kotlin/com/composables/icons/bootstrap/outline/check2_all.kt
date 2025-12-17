package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Check2All: ImageVector
    get() {
        if (_Check2All != null) return _Check2All!!
        
        _Check2All = ImageVector.Builder(
            name = "check2-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.354f, 4.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(5f, 10.293f)
                lineTo(1.854f, 7.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                close()
                moveToRelative(-4.208f, 7f)
                lineToRelative(-0.896f, -0.897f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(0.543f, 0.543f)
                lineToRelative(6.646f, -6.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineToRelative(-7f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.354f, 7.146f)
                lineToRelative(0.896f, 0.897f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-0.897f, -0.896f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
            }
        }.build()
        
        return _Check2All!!
    }

private var _Check2All: ImageVector? = null

