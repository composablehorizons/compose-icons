package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ListOl: ImageVector
    get() {
        if (_ListOl != null) return _ListOl!!
        
        _ListOl = ImageVector.Builder(
            name = "list-ol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.713f, 11.865f)
                verticalLineToRelative(-0.474f)
                horizontalLineTo(2f)
                curveToRelative(0.217f, 0f, 0.363f, -0.137f, 0.363f, -0.317f)
                curveToRelative(0f, -0.185f, -0.158f, -0.31f, -0.361f, -0.31f)
                curveToRelative(-0.223f, 0f, -0.367f, 0.152f, -0.373f, 0.31f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(0.016f, -0.467f, 0.373f, -0.787f, 0.986f, -0.787f)
                curveToRelative(0.588f, -0.002f, 0.954f, 0.291f, 0.957f, 0.703f)
                arcToRelative(0.595f, 0.595f, 0f, false, true, -0.492f, 0.594f)
                verticalLineToRelative(0.033f)
                arcToRelative(0.615f, 0.615f, 0f, false, true, 0.569f, 0.631f)
                curveToRelative(0.003f, 0.533f, -0.502f, 0.8f, -1.051f, 0.8f)
                curveToRelative(-0.656f, 0f, -1f, -0.37f, -1.008f, -0.794f)
                horizontalLineToRelative(0.582f)
                curveToRelative(0.008f, 0.178f, 0.186f, 0.306f, 0.422f, 0.309f)
                curveToRelative(0.254f, 0f, 0.424f, -0.145f, 0.422f, -0.35f)
                curveToRelative(-0.002f, -0.195f, -0.155f, -0.348f, -0.414f, -0.348f)
                horizontalLineToRelative(-0.3f)
                close()
                moveToRelative(-0.004f, -4.699f)
                horizontalLineToRelative(-0.604f)
                verticalLineToRelative(-0.035f)
                curveToRelative(0f, -0.408f, 0.295f, -0.844f, 0.958f, -0.844f)
                curveToRelative(0.583f, 0f, 0.96f, 0.326f, 0.96f, 0.756f)
                curveToRelative(0f, 0.389f, -0.257f, 0.617f, -0.476f, 0.848f)
                lineToRelative(-0.537f, 0.572f)
                verticalLineToRelative(0.03f)
                horizontalLineToRelative(1.054f)
                verticalLineTo(9f)
                horizontalLineTo(1.143f)
                verticalLineToRelative(-0.395f)
                lineToRelative(0.957f, -0.99f)
                curveToRelative(0.138f, -0.142f, 0.293f, -0.304f, 0.293f, -0.508f)
                curveToRelative(0f, -0.18f, -0.147f, -0.32f, -0.342f, -0.32f)
                arcToRelative(0.33f, 0.33f, 0f, false, false, -0.342f, 0.338f)
                close()
                moveTo(2.564f, 5f)
                horizontalLineToRelative(-0.635f)
                verticalLineTo(2.924f)
                horizontalLineToRelative(-0.031f)
                lineToRelative(-0.598f, 0.42f)
                verticalLineToRelative(-0.567f)
                lineToRelative(0.629f, -0.443f)
                horizontalLineToRelative(0.635f)
                close()
            }
        }.build()
        
        return _ListOl!!
    }

private var _ListOl: ImageVector? = null

