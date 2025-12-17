package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SortNumericUp: ImageVector
    get() {
        if (_SortNumericUp != null) return _SortNumericUp!!
        
        _SortNumericUp = ImageVector.Builder(
            name = "sort-numeric-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(330.17f, 258.91f)
                arcToRelative(79f, 79f, 0f, false, false, -55f, 54.17f)
                curveToRelative(-14.27f, 51.05f, 21.19f, 97.77f, 68.83f, 102.53f)
                arcToRelative(84.07f, 84.07f, 0f, false, true, -20.85f, 12.91f)
                curveToRelative(-7.57f, 3.4f, -10.8f, 12.47f, -8.18f, 20.34f)
                lineToRelative(9.9f, 20f)
                curveToRelative(2.87f, 8.63f, 12.53f, 13.49f, 20.9f, 9.91f)
                curveToRelative(58f, -24.76f, 86.25f, -61.61f, 86.25f, -132f)
                verticalLineTo(336f)
                curveToRelative(-0.02f, -51.21f, -48.4f, -91.34f, -101.85f, -77.09f)
                close()
                moveTo(352f, 356f)
                arcToRelative(20f, 20f, 0f, true, true, 20f, -20f)
                arcToRelative(20f, 20f, 0f, false, true, -20f, 20f)
                close()
                moveTo(304f, 96f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-16f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-48f)
                arcToRelative(16f, 16f, 0f, false, false, -14.29f, 8.83f)
                lineToRelative(-16f, 32f)
                arcTo(16f, 16f, 0f, false, false, 304f, 96f)
                close()
                moveTo(107.31f, 36.69f)
                arcToRelative(16f, 16f, 0f, false, false, -22.62f, 0f)
                lineToRelative(-80f, 96f)
                curveTo(-5.35f, 142.74f, 1.78f, 160f, 16f, 160f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(304f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(160f)
                horizontalLineToRelative(48f)
                curveToRelative(14.21f, 0f, 21.38f, -17.24f, 11.31f, -27.31f)
                close()
            }
        }.build()
        
        return _SortNumericUp!!
    }

private var _SortNumericUp: ImageVector? = null

