package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hammer: ImageVector
    get() {
        if (_Hammer != null) return _Hammer!!
        
        _Hammer = ImageVector.Builder(
            name = "hammer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.972f, 2.508f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.16f, -0.556f)
                lineToRelative(-0.178f, -0.129f)
                arcToRelative(5f, 5f, 0f, false, false, -2.076f, -0.783f)
                curveTo(6.215f, 0.862f, 4.504f, 1.229f, 2.84f, 3.133f)
                horizontalLineTo(1.786f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.354f, 0.147f)
                lineTo(0.146f, 4.567f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.706f)
                lineToRelative(2.571f, 2.579f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(1.286f, -1.29f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, -0.353f)
                verticalLineTo(5.57f)
                lineToRelative(8.387f, 8.873f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14f, 14.5f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.017f, -0.689f)
                lineToRelative(-9.129f, -8.63f)
                curveToRelative(0.747f, -0.456f, 1.772f, -0.839f, 3.112f, -0.839f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.472f, -0.334f)
            }
        }.build()
        
        return _Hammer!!
    }

private var _Hammer: ImageVector? = null

