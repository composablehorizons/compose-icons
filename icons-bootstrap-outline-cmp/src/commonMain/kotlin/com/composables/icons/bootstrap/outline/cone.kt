package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cone: ImageVector
    get() {
        if (_Cone != null) return _Cone!!
        
        _Cone = ImageVector.Builder(
            name = "cone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.03f, 1.88f)
                curveToRelative(0.252f, -1.01f, 1.688f, -1.01f, 1.94f, 0f)
                lineToRelative(2.905f, 11.62f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2.125f)
                close()
            }
        }.build()
        
        return _Cone!!
    }

private var _Cone: ImageVector? = null

