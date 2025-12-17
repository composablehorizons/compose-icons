package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cloud_queue: ImageVector
    get() {
        if (_Cloud_queue != null) return _Cloud_queue!!
        
        _Cloud_queue = ImageVector.Builder(
            name = "cloud_queue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 20f)
                quadToRelative(-2.275f, 0f, -3.887f, -1.575f)
                quadTo(1f, 16.85f, 1f, 14.575f)
                quadToRelative(0f, -1.95f, 1.175f, -3.475f)
                quadTo(3.35f, 9.575f, 5.25f, 9.15f)
                quadToRelative(0.625f, -2.3f, 2.5f, -3.725f)
                quadTo(9.625f, 4f, 12f, 4f)
                quadToRelative(2.925f, 0f, 4.962f, 2.037f)
                quadTo(19f, 8.075f, 19f, 11f)
                quadToRelative(1.725f, 0.2f, 2.863f, 1.487f)
                quadTo(23f, 13.775f, 23f, 15.5f)
                quadToRelative(0f, 1.875f, -1.312f, 3.188f)
                quadTo(20.375f, 20f, 18.5f, 20f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(12f)
                quadToRelative(1.05f, 0f, 1.775f, -0.725f)
                quadTo(21f, 16.55f, 21f, 15.5f)
                quadToRelative(0f, -1.05f, -0.725f, -1.775f)
                quadTo(19.55f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineToRelative(-2f)
                quadToRelative(0f, -2.075f, -1.462f, -3.538f)
                quadTo(14.075f, 6f, 12f, 6f)
                quadTo(9.925f, 6f, 8.463f, 7.462f)
                quadTo(7f, 8.925f, 7f, 11f)
                horizontalLineToRelative(-0.5f)
                quadToRelative(-1.45f, 0f, -2.475f, 1.025f)
                quadTo(3f, 13.05f, 3f, 14.5f)
                quadToRelative(0f, 1.45f, 1.025f, 2.475f)
                quadTo(5.05f, 18f, 6.5f, 18f)
                close()
                moveToRelative(5.5f, -6f)
                close()
            }
        }.build()
        
        return _Cloud_queue!!
    }

private var _Cloud_queue: ImageVector? = null

