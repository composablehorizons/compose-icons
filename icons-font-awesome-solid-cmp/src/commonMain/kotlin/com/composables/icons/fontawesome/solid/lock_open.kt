package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LockOpen: ImageVector
    get() {
        if (_LockOpen != null) return _LockOpen!!
        
        _LockOpen = ImageVector.Builder(
            name = "lock-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(423.5f, 0f)
                curveTo(339.5f, 0.3f, 272f, 69.5f, 272f, 153.5f)
                verticalLineTo(224f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(272f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-71.1f)
                curveToRelative(0f, -39.6f, 31.7f, -72.5f, 71.3f, -72.9f)
                curveToRelative(40f, -0.4f, 72.7f, 32.1f, 72.7f, 72f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(32f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-80f)
                curveTo(576f, 68f, 507.5f, -0.3f, 423.5f, 0f)
                close()
            }
        }.build()
        
        return _LockOpen!!
    }

private var _LockOpen: ImageVector? = null

