package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowsAngleContract: ImageVector
    get() {
        if (_ArrowsAngleContract != null) return _ArrowsAngleContract!!
        
        _ArrowsAngleContract = ImageVector.Builder(
            name = "arrows-angle-contract",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.172f, 15.828f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0f)
                lineToRelative(4.096f, -4.096f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineToRelative(-3.975f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2.768f)
                lineTo(0.172f, 15.121f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
                moveTo(15.828f, 0.172f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineToRelative(-4.096f, 4.096f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1f, 0f)
                verticalLineToRelative(3.975f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-2.768f)
                lineTo(15.828f, 0.879f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.707f)
            }
        }.build()
        
        return _ArrowsAngleContract!!
    }

private var _ArrowsAngleContract: ImageVector? = null

