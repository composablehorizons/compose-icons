package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonStandingDress: ImageVector
    get() {
        if (_PersonStandingDress != null) return _PersonStandingDress!!
        
        _PersonStandingDress = ImageVector.Builder(
            name = "person-standing-dress",
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
                moveToRelative(-0.5f, 12.25f)
                verticalLineTo(12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(12f)
                horizontalLineToRelative(1f)
                lineToRelative(-1f, -5f)
                verticalLineToRelative(-0.215f)
                arcToRelative(0.285f, 0.285f, 0f, false, true, 0.56f, -0.078f)
                lineToRelative(0.793f, 2.777f)
                arcToRelative(0.711f, 0.711f, 0f, true, false, 1.364f, -0.405f)
                lineToRelative(-1.065f, -3.461f)
                arcTo(3f, 3f, 0f, false, false, 8.784f, 3.5f)
                horizontalLineTo(7.216f)
                arcToRelative(3f, 3f, 0f, false, false, -2.868f, 2.118f)
                lineTo(3.283f, 9.079f)
                arcToRelative(0.711f, 0.711f, 0f, true, false, 1.365f, 0.405f)
                lineToRelative(0.793f, -2.777f)
                arcToRelative(0.285f, 0.285f, 0f, false, true, 0.56f, 0.078f)
                verticalLineTo(7f)
                lineToRelative(-1f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                close()
            }
        }.build()
        
        return _PersonStandingDress!!
    }

private var _PersonStandingDress: ImageVector? = null

