package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Calendar3Event: ImageVector
    get() {
        if (_Calendar3Event != null) return _Calendar3Event!!
        
        _Calendar3Event = ImageVector.Builder(
            name = "calendar3-event",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 0f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveTo(1f, 3.857f)
                curveTo(1f, 3.384f, 1.448f, 3f, 2f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.552f, 0f, 1f, 0.384f, 1f, 0.857f)
                verticalLineToRelative(10.286f)
                curveToRelative(0f, 0.473f, -0.448f, 0.857f, -1f, 0.857f)
                horizontalLineTo(2f)
                curveToRelative(-0.552f, 0f, -1f, -0.384f, -1f, -0.857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
        }.build()
        
        return _Calendar3Event!!
    }

private var _Calendar3Event: ImageVector? = null

