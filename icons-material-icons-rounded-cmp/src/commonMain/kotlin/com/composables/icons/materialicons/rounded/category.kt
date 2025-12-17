package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Category: ImageVector
    get() {
        if (_Category != null) return _Category!!
        
        _Category = ImageVector.Builder(
            name = "category",
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
                moveTo(11.15f, 3.4f)
                lineTo(7.43f, 9.48f)
                curveToRelative(-0.41f, 0.66f, 0.07f, 1.52f, 0.85f, 1.52f)
                horizontalLineToRelative(7.43f)
                curveToRelative(0.78f, 0f, 1.26f, -0.86f, 0.85f, -1.52f)
                lineTo(12.85f, 3.4f)
                curveToRelative(-0.39f, -0.64f, -1.31f, -0.64f, -1.7f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 17.5f, 22f)
                arcTo(4.5f, 4.5f, 0f, false, true, 13f, 17.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 22f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 21.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
        }.build()
        
        return _Category!!
    }

private var _Category: ImageVector? = null

