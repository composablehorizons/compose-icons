package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Drafts: ImageVector
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
                moveTo(12f, 15.36f)
                lineToRelative(-8f, -5.02f)
                verticalLineTo(18f)
                horizontalLineToRelative(16f)
                lineToRelative(-0.01f, -7.63f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.99f, 8f)
                curveToRelative(0f, -0.72f, -0.37f, -1.35f, -0.94f, -1.7f)
                lineTo(12f, 1f)
                lineTo(2.95f, 6.3f)
                curveTo(2.38f, 6.65f, 2f, 7.28f, 2f, 8f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineToRelative(-0.01f, -10f)
                close()
                moveTo(12f, 3.32f)
                lineTo(19.99f, 8f)
                verticalLineToRelative(0.01f)
                lineTo(12f, 13f)
                lineTo(4f, 8f)
                lineToRelative(8f, -4.68f)
                close()
                moveTo(4f, 18f)
                verticalLineToRelative(-7.66f)
                lineToRelative(8f, 5.02f)
                lineToRelative(7.99f, -4.99f)
                lineTo(20f, 18f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Drafts!!
    }

private var _Drafts: ImageVector? = null

