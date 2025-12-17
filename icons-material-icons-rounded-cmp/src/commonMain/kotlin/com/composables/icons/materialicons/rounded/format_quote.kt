package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_quote: ImageVector
    get() {
        if (_Format_quote != null) return _Format_quote!!
        
        _Format_quote = ImageVector.Builder(
            name = "format_quote",
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
                moveTo(7.17f, 17f)
                curveToRelative(0.51f, 0f, 0.98f, -0.29f, 1.2f, -0.74f)
                lineToRelative(1.42f, -2.84f)
                curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                lineToRelative(-1.03f, 2.06f)
                curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f)
                close()
                moveToRelative(10f, 0f)
                curveToRelative(0.51f, 0f, 0.98f, -0.29f, 1.2f, -0.74f)
                lineToRelative(1.42f, -2.84f)
                curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                lineToRelative(-1.03f, 2.06f)
                curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f)
                close()
            }
        }.build()
        
        return _Format_quote!!
    }

private var _Format_quote: ImageVector? = null

