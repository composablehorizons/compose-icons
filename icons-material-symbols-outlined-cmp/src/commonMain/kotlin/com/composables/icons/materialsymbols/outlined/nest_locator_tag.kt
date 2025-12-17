package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_locator_tag: ImageVector
    get() {
        if (_Nest_locator_tag != null) return _Nest_locator_tag!!
        
        _Nest_locator_tag = ImageVector.Builder(
            name = "nest_locator_tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 22f)
                quadToRelative(-2.925f, 0f, -4.962f, -2.038f)
                quadTo(5f, 17.925f, 5f, 15f)
                quadToRelative(0f, -2.4f, 1.4f, -4.225f)
                quadTo(7.8f, 8.95f, 10f, 8.3f)
                verticalLineTo(3f)
                quadToRelative(0f, -0.425f, 0.288f, -0.713f)
                quadTo(10.575f, 2f, 11f, 2f)
                horizontalLineToRelative(2f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(14f, 2.575f, 14f, 3f)
                verticalLineToRelative(5.3f)
                quadToRelative(2.2f, 0.65f, 3.6f, 2.475f)
                quadTo(19f, 12.6f, 19f, 15f)
                quadToRelative(0f, 2.925f, -2.038f, 4.962f)
                quadTo(14.925f, 22f, 12f, 22f)
                close()
                moveToRelative(0f, -2f)
                quadToRelative(2.075f, 0f, 3.538f, -1.462f)
                quadTo(17f, 17.075f, 17f, 15f)
                quadToRelative(0f, -2.075f, -1.462f, -3.538f)
                quadTo(14.075f, 10f, 12f, 10f)
                quadToRelative(-2.075f, 0f, -3.537f, 1.462f)
                quadTo(7f, 12.925f, 7f, 15f)
                quadToRelative(0f, 2.075f, 1.463f, 3.538f)
                quadTo(9.925f, 20f, 12f, 20f)
                close()
            }
        }.build()
        
        return _Nest_locator_tag!!
    }

private var _Nest_locator_tag: ImageVector? = null

