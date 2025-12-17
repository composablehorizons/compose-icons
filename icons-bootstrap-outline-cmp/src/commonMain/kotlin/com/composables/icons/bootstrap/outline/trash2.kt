package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Trash2: ImageVector
    get() {
        if (_Trash2 != null) return _Trash2!!
        
        _Trash2 = ImageVector.Builder(
            name = "trash2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, -0.037f, 0.225f)
                lineToRelative(-1.684f, 10.104f)
                arcTo(2f, 2f, 0f, false, true, 10.305f, 15f)
                horizontalLineTo(5.694f)
                arcToRelative(2f, 2f, 0f, false, true, -1.973f, -1.671f)
                lineTo(2.037f, 3.225f)
                arcTo(0.7f, 0.7f, 0f, false, true, 2f, 3f)
                curveToRelative(0f, -1.105f, 2.686f, -2f, 6f, -2f)
                reflectiveCurveToRelative(6f, 0.895f, 6f, 2f)
                moveTo(3.215f, 4.207f)
                lineToRelative(1.493f, 8.957f)
                arcToRelative(1f, 1f, 0f, false, false, 0.986f, 0.836f)
                horizontalLineToRelative(4.612f)
                arcToRelative(1f, 1f, 0f, false, false, 0.986f, -0.836f)
                lineToRelative(1.493f, -8.957f)
                curveTo(11.69f, 4.689f, 9.954f, 5f, 8f, 5f)
                reflectiveCurveToRelative(-3.69f, -0.311f, -4.785f, -0.793f)
            }
        }.build()
        
        return _Trash2!!
    }

private var _Trash2: ImageVector? = null

