package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Post_add: ImageVector
    get() {
        if (_Post_add != null) return _Post_add!!
        
        _Post_add = ImageVector.Builder(
            name = "post_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 12f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(5.22f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(6f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(5f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 5f, 3f, 5.9f, 3f, 7f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-6f)
                        curveTo(19f, 12.45f, 18.55f, 12f, 18f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.02f, 5f)
                        horizontalLineTo(19f)
                        verticalLineTo(2.98f)
                        curveTo(19f, 2.44f, 18.56f, 2f, 18.02f, 2f)
                        horizontalLineToRelative(-0.03f)
                        curveTo(17.44f, 2f, 17f, 2.44f, 17f, 2.98f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-2.01f)
                        curveTo(14.45f, 5f, 14.01f, 5.44f, 14f, 5.98f)
                        curveToRelative(0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
                        curveTo(14f, 6.56f, 14.44f, 7f, 14.99f, 7f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(2.01f)
                        curveToRelative(0f, 0.54f, 0.44f, 0.99f, 0.99f, 0.98f)
                        curveToRelative(0.01f, 0f, 0.02f, 0f, 0.03f, 0f)
                        curveToRelative(0.54f, 0f, 0.98f, -0.44f, 0.98f, -0.98f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2.02f)
                        curveTo(21.56f, 7f, 22f, 6.56f, 22f, 6.02f)
                        verticalLineTo(5.98f)
                        curveTo(22f, 5.44f, 21.56f, 5f, 21.02f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 9f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(15f, 9.45f, 14.55f, 9f, 14f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 12f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(15f, 12.45f, 14.55f, 12f, 14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 15f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        curveTo(15f, 15.45f, 14.55f, 15f, 14f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Post_add!!
    }

private var _Post_add: ImageVector? = null

