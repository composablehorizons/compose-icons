package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Games: ImageVector
    get() {
        if (_Games != null) return _Games!!
        
        _Games = ImageVector.Builder(
            name = "games",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 7.29f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.29f)
                curveToRelative(0f, 0.13f, 0.05f, 0.26f, 0.15f, 0.35f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(2.5f, -2.5f)
                curveToRelative(0.09f, -0.09f, 0.14f, -0.21f, 0.14f, -0.35f)
                close()
                moveTo(7.29f, 9f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(2.5f, -2.5f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.5f, -2.5f)
                curveTo(7.55f, 9.05f, 7.43f, 9f, 7.29f, 9f)
                close()
                moveTo(9f, 16.71f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.29f)
                curveToRelative(0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.09f, 0.09f, -0.14f, 0.21f, -0.14f, 0.35f)
                close()
                moveToRelative(7.35f, -7.56f)
                lineToRelative(-2.5f, 2.5f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.29f)
                curveToRelative(-0.14f, -0.01f, -0.26f, 0.04f, -0.36f, 0.14f)
                close()
            }
        }.build()
        
        return _Games!!
    }

private var _Games: ImageVector? = null

