package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fastfood: ImageVector
    get() {
        if (_Fastfood != null) return _Fastfood!!
        
        _Fastfood = ImageVector.Builder(
            name = "fastfood",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.06f, 22.99f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.84f, 0f, 1.53f, -0.64f, 1.63f, -1.46f)
                lineTo(23f, 5.05f)
                horizontalLineToRelative(-5f)
                verticalLineTo(1f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-4.97f)
                lineToRelative(0.3f, 2.34f)
                curveToRelative(1.71f, 0.47f, 3.31f, 1.32f, 4.27f, 2.26f)
                curveToRelative(1.44f, 1.42f, 2.43f, 2.89f, 2.43f, 5.29f)
                verticalLineToRelative(8.05f)
                close()
                moveTo(1f, 21.99f)
                verticalLineTo(21f)
                horizontalLineToRelative(15.03f)
                verticalLineToRelative(0.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1.01f, 1f)
                horizontalLineTo(2.01f)
                curveToRelative(-0.56f, 0f, -1.01f, -0.45f, -1.01f, -1f)
                close()
                moveToRelative(15.03f, -7f)
                curveToRelative(0f, -8f, -15.03f, -8f, -15.03f, 0f)
                horizontalLineToRelative(15.03f)
                close()
                moveTo(1.02f, 17f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-15f)
                close()
            }
        }.build()
        
        return _Fastfood!!
    }

private var _Fastfood: ImageVector? = null

