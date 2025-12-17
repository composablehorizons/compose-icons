package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Drafts: ImageVector
    get() {
        if (_Drafts != null) return _Drafts!!
        
        _Drafts = ImageVector.Builder(
            name = "drafts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.99f, 8f)
                curveToRelative(0f, -0.72f, -0.37f, -1.35f, -0.94f, -1.7f)
                lineToRelative(-8.04f, -4.71f)
                curveToRelative(-0.62f, -0.37f, -1.4f, -0.37f, -2.02f, 0f)
                lineTo(2.95f, 6.3f)
                curveTo(2.38f, 6.65f, 2f, 7.28f, 2f, 8f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineToRelative(-0.01f, -10f)
                close()
                moveToRelative(-11.05f, 4.34f)
                lineToRelative(-7.2f, -4.5f)
                lineToRelative(7.25f, -4.25f)
                curveToRelative(0.62f, -0.37f, 1.4f, -0.37f, 2.02f, 0f)
                lineToRelative(7.25f, 4.25f)
                lineToRelative(-7.2f, 4.5f)
                curveToRelative(-0.65f, 0.4f, -1.47f, 0.4f, -2.12f, 0f)
                close()
            }
        }.build()
        
        return _Drafts!!
    }

private var _Drafts: ImageVector? = null

