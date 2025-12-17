package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonStanding: ImageVector
    get() {
        if (_PersonStanding != null) return _PersonStanding!!
        
        _PersonStanding = ImageVector.Builder(
            name = "person-standing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveTo(6f, 6.75f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, 0.5f, 0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(6.5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(7f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.5f, 0f)
            }
        }.build()
        
        return _PersonStanding!!
    }

private var _PersonStanding: ImageVector? = null

