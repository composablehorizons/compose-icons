package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Play_disabled: ImageVector
    get() {
        if (_Play_disabled != null) return _Play_disabled!!
        
        _Play_disabled = ImageVector.Builder(
            name = "play_disabled",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveToRelative(11.75f, 11.47f)
                lineToRelative(-0.11f, -0.11f)
                lineToRelative(0.11f, 0.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5.19f)
                verticalLineTo(5f)
                lineToRelative(11f, 7f)
                lineToRelative(-2.55f, 1.63f)
                lineTo(8f, 5.19f)
                close()
                moveToRelative(12f, 14.54f)
                lineToRelative(-5.11f, -5.11f)
                lineTo(8f, 7.73f)
                lineTo(4.27f, 4f)
                lineTo(3f, 5.27f)
                lineToRelative(5f, 5f)
                verticalLineTo(19f)
                lineToRelative(5.33f, -3.4f)
                lineToRelative(5.4f, 5.4f)
                lineTo(20f, 19.73f)
                close()
            }
        }.build()
        
        return _Play_disabled!!
    }

private var _Play_disabled: ImageVector? = null

