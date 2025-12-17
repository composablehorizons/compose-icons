package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FiletypeAac: ImageVector
    get() {
        if (_FiletypeAac != null) return _FiletypeAac!!
        
        _FiletypeAac = ImageVector.Builder(
            name = "filetype-aac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.5f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 3f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(5.5f)
                close()
                moveToRelative(-5.808f, 8.554f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.103f, 0.633f)
                verticalLineToRelative(0.495f)
                quadToRelative(0f, 0.369f, 0.103f, 0.627f)
                arcToRelative(0.83f, 0.83f, 0f, false, false, 0.299f, 0.393f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, 0.477f, 0.131f)
                arcToRelative(0.9f, 0.9f, 0f, false, false, 0.402f, -0.088f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, 0.272f, -0.248f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0.117f, -0.364f)
                horizontalLineToRelative(0.765f)
                verticalLineToRelative(0.076f)
                arcToRelative(1.27f, 1.27f, 0f, false, true, -0.226f, 0.674f)
                quadToRelative(-0.204f, 0.29f, -0.55f, 0.454f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.785f, 0.164f)
                quadToRelative(-0.54f, 0f, -0.915f, -0.216f)
                arcToRelative(1.4f, 1.4f, 0f, false, true, -0.57f, -0.627f)
                quadToRelative(-0.195f, -0.408f, -0.194f, -0.976f)
                verticalLineToRelative(-0.498f)
                quadToRelative(0f, -0.568f, 0.196f, -0.978f)
                quadToRelative(0.195f, -0.411f, 0.571f, -0.633f)
                quadToRelative(0.378f, -0.223f, 0.912f, -0.223f)
                quadToRelative(0.327f, 0f, 0.606f, 0.097f)
                quadToRelative(0.28f, 0.093f, 0.49f, 0.272f)
                arcToRelative(1.33f, 1.33f, 0f, false, true, 0.465f, 0.964f)
                verticalLineToRelative(0.073f)
                horizontalLineToRelative(-0.765f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, -0.12f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0f, false, false, -0.272f, -0.261f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.399f, -0.097f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -0.474f, 0.138f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, -0.302f, 0.398f)
                moveTo(0.8f, 15.925f)
                lineToRelative(0.313f, -1.028f)
                horizontalLineTo(2.45f)
                lineToRelative(0.314f, 1.028f)
                horizontalLineToRelative(0.84f)
                lineToRelative(-1.335f, -3.999f)
                horizontalLineToRelative(-0.926f)
                lineToRelative(-1.342f, 4f)
                close()
                moveToRelative(1.002f, -3.234f)
                lineToRelative(0.489f, 1.617f)
                horizontalLineTo(1.277f)
                lineToRelative(0.49f, -1.617f)
                close()
                moveToRelative(2.63f, 3.234f)
                lineToRelative(0.313f, -1.028f)
                horizontalLineTo(6.08f)
                lineToRelative(0.313f, 1.028f)
                horizontalLineToRelative(0.841f)
                lineTo(5.9f, 11.926f)
                horizontalLineToRelative(-0.926f)
                lineToRelative(-1.341f, 4f)
                close()
                moveToRelative(1.001f, -3.234f)
                lineToRelative(0.49f, 1.617f)
                horizontalLineTo(4.909f)
                lineToRelative(0.49f, -1.617f)
                close()
            }
        }.build()
        
        return _FiletypeAac!!
    }

private var _FiletypeAac: ImageVector? = null

